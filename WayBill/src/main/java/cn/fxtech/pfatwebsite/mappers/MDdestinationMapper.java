package cn.fxtech.pfatwebsite.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import cn.fxtech.pfatwebsite.models.MDdestination;
import tk.mybatis.mapper.common.Mapper;

public interface MDdestinationMapper extends Mapper<MDdestination> {
	@Select("SELECT * FROM terminal_destination order by dtype")
	public List<MDdestination> findAll();

	@Insert("INSERT INTO terminal_destination (destination, dtype) VALUES (#{destination}, #{dtype})")
	public int insertRecord(MDdestination dest);
}
