/**
 * <p>Title: RegionServiceImpl.java</p>   
 * <p>Description: </p>  
 * <p>Copyright: Copyright (c) 2018</p>   
 * @author 林猛 
 * @date 2018年5月2日  
 * @version 1.0   
*/  
package com.study.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.dao.RegionMapper;
import com.study.service.RegionService;

/**
 * @author linmeng
 *
 */
@Service
public class RegionServiceImpl implements RegionService{

	/* (non-Javadoc)
	 * @see com.study.service.RegionService#findcode(java.lang.String)
	 */
	@Autowired
	private RegionMapper regionMapper;
	@Override
	public void findcode() {
		String string="自贡\r\n张家界\r\n昭通\r\n曲靖\r\n迪庆\r\n保山\r\n云南省厅\r\n岳阳\r\n永州\r\n营口\r\n宜昌\r\n宿州\r\n邢台\r\n塔城\r\n襄阳\r\n湘潭\r\n咸宁\r\n吴忠\r\n乌兰察布\r\n随州\r\n石嘴山\r\n十堰\r\n神农架\r\n延安\r\n渭南\r\n陕西省厅\r\n汉中\r\n安康\r\n宝鸡\r\n长治\r\n山西省厅\r\n日照\r\n玉树\r\n青海省厅\r\n海北\r\n果洛\r\n格尔木\r\n秦皇岛\r\n内蒙区厅\r\n绵阳\r\n娄底\r\n临沂\r\n荆州\r\n江西省厅\r\n萍乡\r\n景德镇\r\n抚州\r\n济南\r\n白山\r\n黄冈\r\n湖北省厅\r\n绥化\r\n双鸭山\r\n黑河\r\n郑州\r\n平顶山\r\n南阳\r\n任丘\r\n秦皇岛\r\n冀中\r\n哈尔滨\r\n武威\r\n天水\r\n甘肃省厅\r\n抚顺\r\n鄂州\r\n德阳\r\n达州\r\n汕尾\r\n潮州\r\n常德\r\n巴中\r\n鞍山\r\n阿拉善\r\n东莞\r\n云浮\r\n湛江\r\n肇庆\r\n阳江\r\n柳州\r\n梧州\r\n百色\r\n贺州";
		String[] cityname = string.split("\r\n");
		for (int i = 0; i < cityname.length; i++) {
			int findcode = 0;
			try {
				findcode =regionMapper.findcode("%"+cityname[i]+"%");
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			System.out.print(findcode+"\r\n");
		}
	}

}
