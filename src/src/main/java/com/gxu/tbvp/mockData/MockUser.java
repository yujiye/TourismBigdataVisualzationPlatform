package com.gxu.tbvp.mockData;

import com.gxu.tbvp.domain.User;
import com.gxu.tbvp.exception.SelfJSONResult;
import com.gxu.tbvp.service.UserService;
import com.gxu.tbvp.utils.PasswordHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class MockUser {

    @Resource
    private UserService userService;

    public static int sex;
    public static String firstName = "赵钱孙李周吴郑王冯陈褚卫蒋沈韩杨朱秦尤许何吕赵钱孙李周吴郑王冯陈施张孔曹严华金赵赵钱孙李周吴郑王冯陈钱孙李周吴郑王冯陈魏陶姜戚谢邹喻柏水窦赵钱孙李周吴郑王冯陈章云苏潘葛赵钱孙李周吴郑王冯陈奚范彭郎鲁韦昌马赵钱孙李周吴郑王冯陈苗凤花方俞任袁赵钱孙李周吴郑王冯陈柳酆鲍史唐费赵钱孙李周吴郑王冯陈廉岑薛赵钱孙李周吴郑王冯陈雷贺倪赵钱孙李周吴郑王冯陈汤滕殷罗赵钱孙李周吴郑王冯陈毕郝赵钱孙李周吴郑王冯陈邬安常乐于时赵钱孙李周吴郑王冯陈傅皮卞齐康伍赵钱孙李周吴郑王冯陈余元卜顾孟平黄和穆萧尹姚邵湛汪祁毛禹狄米贝明臧计伏成戴谈宋茅庞熊纪舒屈项祝董梁杜阮蓝闵席季麻强贾路娄危江童赵钱孙李周吴郑王冯陈颜郭梅盛林赵钱孙李周吴郑王冯陈刁钟徐邱骆高夏蔡赵钱孙李周吴郑王冯陈田樊胡凌霍赵钱孙李周吴郑王冯陈虞赵钱孙李周吴郑王冯陈万支柯咎赵钱孙李周吴郑王冯陈赵钱孙李周吴郑王冯陈管卢莫经房裘缪干解应宗宣丁贲邓赵钱孙李周吴郑王冯陈郁单杭洪包诸左石崔吉钮龚程嵇邢滑裴陆荣翁荀羊於惠甄魏加封芮羿储靳汲邴糜松井段富巫乌焦巴弓牧隗山谷车侯宓蓬全郗班仰秋仲伊宫宁仇栾暴甘钭厉戎祖武符刘姜詹束龙叶幸司韶郜黎蓟薄印宿白怀蒲台从鄂索咸籍赖卓蔺屠蒙池乔阴郁胥能苍双闻莘党翟谭贡劳逄姬申扶堵冉宰郦雍却璩桑桂濮牛寿通边扈燕冀郏浦尚农温别庄晏柴瞿阎充慕连茹习宦艾鱼容向古易慎戈廖庚终暨居衡步都耿满赵钱孙李周吴郑王冯陈弘匡国文寇广禄阙东殴殳沃利蔚越夔隆师巩厍聂晁勾敖融冷訾辛阚那简饶空曾毋赵钱孙李周吴郑王冯陈沙乜养鞠须丰巢关蒯相查后江红游竺权逯盖益桓赵钱孙李周吴郑王冯陈公万俟司马上官欧阳夏侯诸葛闻人东方赫连皇甫尉迟公羊澹台公冶宗政濮阳淳于仲孙太叔申屠公孙乐正轩辕令狐钟离闾丘长孙赵钱孙李周吴郑王冯陈慕容鲜于宇文司徒司空亓官司寇仉督子车颛孙端木巫马公西漆雕乐正壤驷公良拓拔夹谷宰父谷粱晋楚阎法汝鄢涂赵钱孙李周吴郑王冯陈钦段干百里东郭南门呼延归海羊舌微生岳帅缑亢况后有琴梁丘左丘东门西门商牟佘佴伯赏赵钱孙李周吴郑王冯陈南宫墨哈谯笪年爱阳佟第五言福百赵钱孙李周吴郑王冯陈家姓续";
    public static String girl = "秀娟英华慧巧美娜静淑惠珠翠雅芝玉萍红娥玲芬芳燕彩春菊兰凤洁梅琳素云莲真环雪荣爱妹霞香月莺媛艳瑞凡佳嘉琼勤珍贞莉桂娣叶璧璐娅琦晶妍茜秋珊莎锦黛青倩婷姣婉娴瑾颖露瑶怡婵雁蓓纨仪荷丹蓉眉君琴蕊薇菁梦岚苑婕馨瑗琰韵融园艺咏卿聪澜纯毓悦昭冰爽琬茗羽希宁欣飘育滢馥筠柔竹霭凝晓欢霄枫芸菲寒伊亚宜可姬舒影荔枝思丽";
    public static String boy = "伟刚勇毅俊峰强军平保东文辉力明永健世广志义兴良海山仁波宁贵福生龙元全国胜学祥才发武新利清飞彬富顺信子杰涛昌成康星光天达安岩中茂进林有坚和彪博诚先敬震振壮会思群豪心邦承乐绍功松善厚庆磊民友裕河哲江超浩亮政谦亨奇固之轮翰朗伯宏言若鸣朋斌梁栋维启克伦翔旭鹏泽晨辰士以建家致树炎德行时泰盛雄琛钧冠策腾楠榕风航弘";
    public static final String[] email_suffix = "@gmail.com,@yahoo.com,@msn.com,@hotmail.com,@aol.com,@ask.com,@live.com,@qq.com,@0355.net,@163.com,@163.net,@263.net,@3721.net,@yeah.net,@googlemail.com,@126.com,@sina.com,@sohu.com,@yahoo.com.cn".split(",");
    public static String letter = "qazwsxedcrfvtgbyhnujmik,ol.";
    public static String number = "783205961";
    public static final String[] province = "北京,天津,河北,山西,内蒙,辽宁,吉林,黑龙江,上海,江苏,浙江,安徽,福建,江西,山东,河南,湖北,湖南,广东,广西,海南,重庆,四川,贵州,云南,西藏,陕西,甘肃,青海,宁夏,新疆,台湾,香港,澳门,海外".split(",");
    public static final int[] provinceId = {110000,120000,130000,140000,150000,210000,220000,230000,310000,320000,330000,340000,350000,360000,370000,410000,420000,430000,440000,450000,460000,500000,510000,520000,530000,540000,610000,620000,630000,640000,650000,710000,810000,820000,990000};

    //随机生成start-end之间的数
    public static int getNum(int start, int end) {
        return (int)(Math.random()*(end - start +1)+start);
    }

    /*
    返回中文姓名
    */
    private static String getChineseName() {
        int index = getNum(0, firstName.length()-1);
        String first = firstName.substring(index, index+1);
        sex = getNum(0, 1);

        if (sex == 0) {
            index = getNum(0, boy.length()-1);
            String second = boy.substring(index, index+1);
            index = getNum(0, boy.length()-1);
            String third = boy.substring(index, index+1);
            return first+second+third;
        }
        else {
            index = getNum(0, girl.length()-1);
            String second = girl.substring(index, index+1);
            index = getNum(0, girl.length()-1);
            String third = girl.substring(index, index+1);
            return first+second+third;
        }
    }

    /*
    返回长度为8的密码
    */
    private static String getPassword(int length){
        //length定义密码的长度
        String password = "";
        Random random = new Random();

        for(int i=0; i<length; i++){
            String chartOrNum = random.nextInt(2) % 2 == 0 ? "char":"num";
            if ("char".equalsIgnoreCase(chartOrNum)) {
                //大小写
                int temp = random.nextInt(2) % 2 == 0 ? 65:97;
                password += (char)(random.nextInt(26) + temp);
            } else if("num".equalsIgnoreCase(chartOrNum)) {
                password += String.valueOf(random.nextInt(10));
            }
        }
        return password;
    }

    /*
    返回手机号码
    */
    private static String[] telFirst = "134,189,166,181,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153".split(",");
    private static String getTel(){
        int index = getNum(0, telFirst.length-1);
        String first = telFirst[index];
        String second = String.valueOf(getNum(1, 888) + 10000).substring(1);
        String third = String.valueOf(getNum(1, 9100) + 10000).substring(1);
        return first+second+third;
    }

    /*
    返回年龄
    */
    private static int getAge(){
        return getNum(3,80);
    }

    /*
    返回用户地址,provinceid地址代码
    */
    private static int provinceid;
    private static String getAddress() {
        int index = getNum(0, province.length-1);
        provinceid = provinceId[index];
        return province[index];
    }

    @RequestMapping("/mockUser")
    public SelfJSONResult insetBach() throws ParseException {
        MockDate mockDate = new MockDate();
        List<User> userList = new ArrayList<>();
        PasswordHelper passwordHelper = new PasswordHelper();
        for (int i = 0; i < 10000; i++) {
            User user = new User();
            String name = getChineseName();
            user.setUsername(name);
            user.setAddressid(provinceid);
            user.setPassword(getPassword(10));
            user.setName(name);
            user.setPhone(getTel());
            user.setRegisterTime(mockDate.RondomDate());
            user.setSex(sex);
            user.setAge(getAge());
            user.setEnable(1);
            user.setProvince(getAddress());
            passwordHelper.encryptPassword(user);
            userList.add(user);
        }
        int temp = userService.insertBach(userList);
//        int temp = userService.save(userList.get(0));
        if (temp == 1){
            return SelfJSONResult.ok(userList.get(0));
        } else {
            return SelfJSONResult.errorException("插入失败，再次刷新即可");
        }
    }

    public static void main(String args[]) throws ParseException {

    }

}
