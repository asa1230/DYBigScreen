package com.dayang.newmedia.newscommand.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayang.newmedia.newscommand.db.dao.CustomSettingsMapper;
import com.dayang.newmedia.newscommand.db.model.CustomSettings;
import com.dayang.newmedia.newscommand.db.model.CustomSettingsQuery;
import com.dayang.newmedia.newscommand.db.model.CustomSettingsQuery.Criteria;

@Service("customSettingService")
public class CustomSettingService {
    @Autowired
    private CustomSettingsMapper customSettingsMapper ;
    
    /**
     *  根据配置值,获取相应配置名称如 （caiji：文稿编辑任务）
     * @param configValue
     * @return
     */
    public String  getConfigNameByValue(String configType,String configValue){
        String retName ="" ;
        CustomSettingsQuery example = new CustomSettingsQuery();
        Criteria createCriteria = example.createCriteria();
        createCriteria.andCutypeEqualTo(configType);
        createCriteria.andCuvalueEqualTo(configValue);
        List<CustomSettings> aSettingList = customSettingsMapper.selectByExample(example);
        if(!aSettingList.isEmpty()){
            retName = aSettingList.get(0).getCuname() ;
        }
        return retName ;
    }
    
    /**
     *  根据配置类型,返回相应配置列表
     * @param configType 
     * @return
     */
    public List<CustomSettings> getCustomConfigList(String configType){
        CustomSettingsQuery example = new CustomSettingsQuery();
        Criteria createCriteria = example.createCriteria();
        createCriteria.andCutypeEqualTo(configType);
        List<CustomSettings> aSettingList = customSettingsMapper.selectByExample(example);
        return aSettingList ;
    }
}
