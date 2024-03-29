package br.edu.unicv.unicvfoods.api.controller;

import br.edu.unicv.unicvfoods.domain.model.DepartmentEntity;
import br.edu.unicv.unicvfoods.domain.service.GenericService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController extends GenericController<DepartmentEntity> {

    public DepartmentController(GenericService<DepartmentEntity> service) {
        super(service);
    }

}
