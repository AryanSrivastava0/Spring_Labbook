package com.labbook.lab2.service;

import java.util.List;

import com.labbook.lab2.entity.Trainee;

public interface TraineeService {

	public List<Trainee> getTrainees();

	public void saveTrainee(Trainee theTrainee);

	public Trainee getTrainee(int id);

	public void updateTrainee(Trainee theTrainee);

	public void deleteTrainee(int id);
}
