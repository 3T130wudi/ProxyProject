package dao;

import entity.Certificates;

import java.util.List;

public interface CertificatesDao {
    List<Certificates> selectcertificates();

    List<Certificates> certificatesselect(Certificates certificates);

    int insertcertificates(Certificates certificates);

    int updatecertificates(Certificates certificates);

    Certificates selectficates(Certificates certificates);

    int deletecertificates(int certificates_id);
}
