package com.sk.cuello.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cuello_task")
public class CuelloTask {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "cuello_task_gen")
    @SequenceGenerator(name = "cuello_task_gen", sequenceName = "cuello_task_seq", allocationSize = 50)
    @Column(name = "task_id")
    private Long taskId;

    @Column(name = "task_name", nullable = false)
    private String taskName;

    @Column(name = "task_desc")
    private String taskDescription;

    @ManyToOne
    @JoinColumn(name = "task_created_by")
    private CuelloUser taskCreatedByUser;

    @ManyToOne
    @JoinColumn(name = "task_assigned_to")
    private CuelloUser taskAssignedToUser;

    @Column(name = "task_status")
    private String taskStatus;

    public CuelloTask() {

    }
}
