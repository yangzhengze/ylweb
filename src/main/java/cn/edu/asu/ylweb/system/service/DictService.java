package cn.edu.asu.ylweb.system.service;

import java.util.List;

import cn.edu.asu.ylweb.common.service.IService;
import cn.edu.asu.ylweb.system.domain.Dict;

public interface DictService extends IService<Dict> {

	List<Dict> findAllDicts(Dict dict);

	Dict findById(Long dictId);

	void addDict(Dict dict);

	void deleteDicts(String dictIds);

	void updateDict(Dict dicdt);
}
