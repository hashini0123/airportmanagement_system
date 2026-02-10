package edu.icet.service;

public interface AirLineService {

    void addAirLine(AirLine airline);
    void updateAriLine(AirLine airLine);
    void deleteAirLine(Integer id);
    AirLineList searchId(Integer id);
    List<AirLine> getAll();

}
