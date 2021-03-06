package cn.comtom.app.standard.component.quartz.mapper;

import cn.comtom.app.standard.component.quartz.mapper.common.JobMapper;
import cn.comtom.app.standard.component.quartz.model.dbo.ScheduleJobLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * @version        1.0.0, 18/03/20
 * @author         huhailang
 */
@Mapper
public interface ScheduleJobLogMapper extends JobMapper<ScheduleJobLog> {

}