package com.initgrep.compaigner.address;

import java.util.List;

import com.initgrep.compaigner.common.CommonCrudService;
import com.initgrep.compaigner.exception.DataNotFoundException;

public interface AddressService extends CommonCrudService<Address, Long, DataNotFoundException> {

	List<Address> getAllByOwnerId(Long OwnerId) throws DataNotFoundException;
	List<Address> getAllByOwnerEmail(String email) throws DataNotFoundException;
	Address getByIdAndOwnerEmail(Long id, String email) throws DataNotFoundException;
	Address saveByOwnerEmail(String email, Address address) throws DataNotFoundException;
	
}
