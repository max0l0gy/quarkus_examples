package cloud.max0l0gy.statefull.msvc;

import cloud.max0l0gy.statefull.msvc.entity.CommodityPassport;
import cloud.max0l0gy.statefull.msvc.repository.CommodityPassportRepository;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Slf4j
@Path("/customer-passport")
public class CommodityPassportResource {
    @Inject
    CommodityPassportRepository commodityPassportRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CommodityPassport> list() {
        return commodityPassportRepository.listAll();
    }

    @Transactional
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public CommodityPassport create(CommodityPassport entity) {
        log.info("CREATE CP");
        CommodityPassport cp = new CommodityPassport();
        return commodityPassportRepository.save(entity);
    }

}
