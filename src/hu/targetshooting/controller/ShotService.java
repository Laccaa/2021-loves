package hu.targetshooting.controller;

import hu.targetshooting.model.domain.ShotResult;

import java.util.List;
import java.util.stream.Collectors;

public class ShotService {


    private final List<ShotResult> results;

    public ShotService(List<ShotResult> results) {
        this.results = results;
    }
    public String getTwoSuccessShotIds(){
        return results.stream()
                .filter(ShotResult::hasTwoSuccessShotsInRow)
                .map(ShotResult::getId)
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
    }

}
