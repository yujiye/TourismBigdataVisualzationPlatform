package com.gxu.tbvp.exception;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @Title: LeeJSONResult.java
 * @Package com.lee.utils
 * @Description: 自定义响应数据结构
 * 				这个类是提供给门户，ios，安卓，微信商城用的
 * 				门户接受此类数据后需要使用本类的方法转换成对于的数据类型格式（类，或者list）
 * 				其他自行处理
 * 				200：表示成功
 * 				500：表示错误，错误信息在msg字段中
 * 				501：bean验证错误，不管多少个错误都以map形式返回
 * 				502：拦截器拦截到用户token出错
 * 				555：异常抛出信息
 */
public class SelfJSONResult {
	
	//定义jackson对象
	private static final ObjectMapper MAPPER = new ObjectMapper();
	
	//响应业务状态
	private Integer status;
	
	//响应消息
	private String msg;
	
	//响应中的数据
	private Object data;
	
	private String ok;
	
	public static SelfJSONResult build(Integer status, String msg, Object data) {
		return new SelfJSONResult(status, msg, data);
	}

	//	500：表示错误，错误信息在msg字段中
	public static SelfJSONResult errorMsg(String msg) {
		return new SelfJSONResult(500, msg, null);
	}
	
	//	501：bean验证错误，不管多少个错误都以map形式返回
	public static SelfJSONResult errorMap(Object data) {
		return new SelfJSONResult(501, "bean验证错误", data);
	}
	
	//	502：拦截器拦截到用户token出错
	public static SelfJSONResult erroeTokenMsg(String msg) {
		return new SelfJSONResult(502, msg, null);
	}
	
	//	555：异常抛出信息
	public static SelfJSONResult errorException(String msg) {
		return new SelfJSONResult(555, msg, null);
	}
	
	//	200：表示成功
	public static SelfJSONResult ok(Object data) {
		return new SelfJSONResult(data);
	}
	
	public SelfJSONResult() {
		
	}
	
	public SelfJSONResult(Integer status, String msg, Object data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}
	
	public SelfJSONResult(Object data) {
		this.status = 200;
		this.msg = "OK";
		this.data = data;
	}
	
	public boolean isOK() {
		return this.status == 200;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getOk() {
		return ok;
	}

	public void setOk(String ok) {
		this.ok = ok;
	}

	public static ObjectMapper getMapper() {
		return MAPPER;
	}
	
    /**
     * 
     * @Description: 将json结果集转化为LeeJSONResult对象
     * 				需要转换的对象是一个类
     * @param jsonData
     * @param clazz
     * @return
     */
    public static SelfJSONResult formatToPojo(String jsonData, Class<?> clazz) {
        try {
            if (clazz == null) {
                return MAPPER.readValue(jsonData, SelfJSONResult.class);
            }
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (clazz != null) {
                if (data.isObject()) {
                    obj = MAPPER.readValue(data.traverse(), clazz);
                } else if (data.isTextual()) {
                    obj = MAPPER.readValue(data.asText(), clazz);
                }
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }
    
    /**
     * 
     * @Description: 没有object对象的转化
     * @param json
     * @return
     */
    public static SelfJSONResult format(String json) {
        try {
            return MAPPER.readValue(json, SelfJSONResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 
     * @Description: Object是集合转化
     * 				需要转换的对象是一个list
     * @param jsonData
     * @param clazz
     * @return
     */
    public static SelfJSONResult formatToList(String jsonData, Class<?> clazz) {
        try {
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isArray() && data.size() > 0) {
                obj = MAPPER.readValue(data.traverse(),
                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }
	
}
