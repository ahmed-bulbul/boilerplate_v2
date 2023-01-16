package com.bulbul.boilerplate.configurationmanagement.entity.adminstration;


import com.bulbul.boilerplate.common.generic.entity.AbstractDomainBasedEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.*;


@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "workflow_actions")
public class WorkFlowAction extends AbstractDomainBasedEntity {
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    @Column(name = "order_no", nullable = false, columnDefinition = "SMALLINT")
    private Integer orderNumber;
    @Column(name = "show", nullable = false, columnDefinition = "bit default 1")
    private boolean show;
    @Column(name = "label", nullable = false)
    private String label;

    @Transient
    private boolean finalItem;

    public static WorkFlowAction withId(Long workflowActionId) {
        WorkFlowAction workFlowAction = new WorkFlowAction();
        workFlowAction.setId(workflowActionId);
        return workFlowAction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WorkFlowAction)) return false;
        if (!super.equals(o)) return false;

        WorkFlowAction that = (WorkFlowAction) o;

        return getId() != null ? getId().equals(that.getId()) : that.getId() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getId() != null ? getId().hashCode() : 0);
        return result;
    }
}
