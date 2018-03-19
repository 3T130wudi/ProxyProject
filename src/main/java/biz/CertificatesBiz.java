package biz;

import entity.Certificates;

import java.util.List;

public interface CertificatesBiz {
    List<Certificates> selectcertificates();
    List<Certificates> certificatesselect(Certificates certificates);
    boolean insertcertificates(Certificates certificates);

    boolean updatecertificates(Certificates certificates);

    Certificates selectficates(Certificates certificates);

    boolean deletecertificates(int certificates_id);
}
