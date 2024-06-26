package webml.base.repository;

import webml.base.entity.Menu;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long>, MenuRepositoryCustom {

    List<Menu> findByParentIsNull(Sort menuOrder);

    List<Menu> findByParentMenuIdx(Long parentMenuIdx);

    int countByParentIsNull();

    int countByParentMenuIdx(Long menuIdx);
}
