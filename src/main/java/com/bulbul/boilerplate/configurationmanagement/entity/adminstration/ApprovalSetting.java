package com.bulbul.boilerplate.configurationmanagement.entity.adminstration;


import com.bulbul.boilerplate.common.generic.entity.AbstractDomainBasedEntity;
import com.bulbul.boilerplate.common.generic.payload.marker.IDto;
import com.bulbul.boilerplate.configurationmanagement.entity.ConfigSubmoduleItem;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "approval_settings", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"workflow_action_id", "submodule_item_id", "is_active"})
})
public class ApprovalSetting extends AbstractDomainBasedEntity implements IDto {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workflow_action_id")
    private WorkFlowAction workFlowAction;
    @Column(name = "workflow_action_id", updatable = false, insertable = false)
    private Long workFlowActionId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "submodule_item_id", nullable = false)
    private ConfigSubmoduleItem configSubmoduleItem;
    @Column(name = "submodule_item_id", updatable = false, insertable = false)
    private Long subModuleItemId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ApprovalSetting)) return false;
        if (!super.equals(o)) return false;

        ApprovalSetting that = (ApprovalSetting) o;

        if (getWorkFlowAction() != that.getWorkFlowAction()) return false;
        return getSubModuleItemId() != null ? getSubModuleItemId().equals(that.getSubModuleItemId()) : that.getSubModuleItemId() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getWorkFlowAction() != null ? getWorkFlowAction().hashCode() : 0);
        result = 31 * result + (getSubModuleItemId() != null ? getSubModuleItemId().hashCode() : 0);
        return result;
    }
}
