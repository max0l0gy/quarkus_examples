package cloud.max0l0gy.statefull.msvc.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "commodity_passport")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommodityPassport {
    @Id
    @GeneratedValue(generator = Constants.ID_GENERATOR_COMMODITY_PASSPORT)
    @Column(updatable = false)
    private Long id;
    @Column(name = "history", nullable = false, length = 2048)
    private String history;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_of_creation", nullable = false, updatable = false)
    @org.hibernate.annotations.CreationTimestamp
    private Date dateOfCreation;

}
