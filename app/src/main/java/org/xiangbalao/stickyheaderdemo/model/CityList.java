package org.xiangbalao.stickyheaderdemo.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by longtaoge on 2016/9/18.
 */
public class CityList  implements Serializable {


    /**
     * data : [{"cityCode":"130100","cityName":"石家庄市","counties":[{"countyCode":"130102","countyName":"长安区"},{"countyCode":"130104","countyName":"桥西区"},{"countyCode":"130105","countyName":"新华区"},{"countyCode":"130107","countyName":"井陉矿区"},{"countyCode":"130108","countyName":"裕华区"},{"countyCode":"130109","countyName":"藁城区"},{"countyCode":"130110","countyName":"鹿泉区"},{"countyCode":"130111","countyName":"栾城区"},{"countyCode":"130121","countyName":"井陉县"},{"countyCode":"130123","countyName":"正定县"},{"countyCode":"130125","countyName":"行唐县"},{"countyCode":"130126","countyName":"灵寿县"},{"countyCode":"130127","countyName":"高邑县"},{"countyCode":"130128","countyName":"深泽县"},{"countyCode":"130129","countyName":"赞皇县"},{"countyCode":"130130","countyName":"无极县"},{"countyCode":"130131","countyName":"平山县"},{"countyCode":"130132","countyName":"元氏县"},{"countyCode":"130133","countyName":"赵县"},{"countyCode":"130183","countyName":"晋州市"},{"countyCode":"130184","countyName":"新乐市"}]},{"cityCode":"130200","cityName":"唐山市","counties":[{"countyCode":"130202","countyName":"路南区"},{"countyCode":"130203","countyName":"路北区"},{"countyCode":"130204","countyName":"古冶区"},{"countyCode":"130205","countyName":"开平区"},{"countyCode":"130207","countyName":"丰南区"},{"countyCode":"130208","countyName":"丰润区"},{"countyCode":"130209","countyName":"曹妃甸区"},{"countyCode":"130223","countyName":"滦县"},{"countyCode":"130224","countyName":"滦南县"},{"countyCode":"130225","countyName":"乐亭县"},{"countyCode":"130227","countyName":"迁西县"},{"countyCode":"130229","countyName":"玉田县"},{"countyCode":"130281","countyName":"遵化市"},{"countyCode":"130283","countyName":"迁安市"}]},{"cityCode":"130300","cityName":"秦皇岛市","counties":[{"countyCode":"130302","countyName":"海港区"},{"countyCode":"130303","countyName":"山海关区"},{"countyCode":"130304","countyName":"北戴河区"},{"countyCode":"130321","countyName":"青龙县"},{"countyCode":"130322","countyName":"昌黎县"},{"countyCode":"130323","countyName":"抚宁县"},{"countyCode":"130324","countyName":"卢龙县"}]},{"cityCode":"130400","cityName":"邯郸市","counties":[{"countyCode":"130402","countyName":"邯山区"},{"countyCode":"130403","countyName":"丛台区"},{"countyCode":"130404","countyName":"复兴区"},{"countyCode":"130406","countyName":"峰峰矿区"},{"countyCode":"130421","countyName":"邯郸县"},{"countyCode":"130423","countyName":"临漳县"},{"countyCode":"130424","countyName":"成安县"},{"countyCode":"130425","countyName":"大名县"},{"countyCode":"130426","countyName":"涉县"},{"countyCode":"130427","countyName":"磁县"},{"countyCode":"130428","countyName":"肥乡县"},{"countyCode":"130429","countyName":"永年县"},{"countyCode":"130430","countyName":"邱县"},{"countyCode":"130431","countyName":"鸡泽县"},{"countyCode":"130432","countyName":"广平县"},{"countyCode":"130433","countyName":"馆陶县"},{"countyCode":"130434","countyName":"魏县"},{"countyCode":"130435","countyName":"曲周县"},{"countyCode":"130481","countyName":"武安市"}]},{"cityCode":"130500","cityName":"邢台市","counties":[{"countyCode":"130502","countyName":"桥东区"},{"countyCode":"130503","countyName":"桥西区"},{"countyCode":"130521","countyName":"邢台县"},{"countyCode":"130522","countyName":"临城县"},{"countyCode":"130523","countyName":"内丘县"},{"countyCode":"130524","countyName":"柏乡县"},{"countyCode":"130525","countyName":"隆尧县"},{"countyCode":"130526","countyName":"任县"},{"countyCode":"130527","countyName":"南和县"},{"countyCode":"130528","countyName":"宁晋县"},{"countyCode":"130529","countyName":"巨鹿县"},{"countyCode":"130530","countyName":"新河县"},{"countyCode":"130531","countyName":"广宗县"},{"countyCode":"130532","countyName":"平乡县"}]}]
     * message : 查询数据成功
     * success : true
     */

    private String message;
    private boolean success;
    /**
     * cityCode : 130100
     * cityName : 石家庄市
     * counties : [{"countyCode":"130102","countyName":"长安区"},{"countyCode":"130104","countyName":"桥西区"},{"countyCode":"130105","countyName":"新华区"},{"countyCode":"130107","countyName":"井陉矿区"},{"countyCode":"130108","countyName":"裕华区"},{"countyCode":"130109","countyName":"藁城区"},{"countyCode":"130110","countyName":"鹿泉区"},{"countyCode":"130111","countyName":"栾城区"},{"countyCode":"130121","countyName":"井陉县"},{"countyCode":"130123","countyName":"正定县"},{"countyCode":"130125","countyName":"行唐县"},{"countyCode":"130126","countyName":"灵寿县"},{"countyCode":"130127","countyName":"高邑县"},{"countyCode":"130128","countyName":"深泽县"},{"countyCode":"130129","countyName":"赞皇县"},{"countyCode":"130130","countyName":"无极县"},{"countyCode":"130131","countyName":"平山县"},{"countyCode":"130132","countyName":"元氏县"},{"countyCode":"130133","countyName":"赵县"},{"countyCode":"130183","countyName":"晋州市"},{"countyCode":"130184","countyName":"新乐市"}]
     */

    private List<City> data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<City> getData() {
        return data;
    }

    public void setData(List<City> data) {
        this.data = data;
    }


}
