package cloud.max0l0gy.statefull.msvc.repository;

import cloud.max0l0gy.statefull.msvc.entity.CommodityPassport;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;

/**
 * using the repository pattern
 * 
 */
@ApplicationScoped
public class CommodityPassportRepository implements PanacheRepository<CommodityPassport> {
    public Optional<CommodityPassport> findByEmail(Long id) {
        return find("id", id).firstResultOptional();
    }
    public CommodityPassport save(CommodityPassport cp) {
        persist(cp);
        return cp;
    }
}
