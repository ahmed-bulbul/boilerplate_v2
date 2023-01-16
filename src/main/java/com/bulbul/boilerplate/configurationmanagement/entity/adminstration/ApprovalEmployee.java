package com.bulbul.boilerplate.configurationmanagement.entity.adminstration;

import com.bulbul.boilerplate.common.generic.entity.AbstractDomainBasedEntity;
import com.bulbul.boilerplate.common.generic.payload.marker.IDto;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "approval_employees")
public class ApprovalEmployee extends AbstractDomainBasedEntity implements IDto {

    @Column(name = "employee_id", nullable = false)
    private Long employeeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "approval_setting_id")
    private ApprovalSetting approvalSetting;

    @Column(name = "approval_setting_id", insertable = false, updatable = false)
    private Long approvalSettingId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ApprovalEmployee)) return false;
        if (!super.equals(o)) return false;

        ApprovalEmployee that = (ApprovalEmployee) o;

        if (getEmployeeId() != null ? !getEmployeeId().equals(that.getEmployeeId()) : that.getEmployeeId() != null)
            return false;
        return getApprovalSetting() != null ? getApprovalSetting().equals(that.getApprovalSetting()) : that.getApprovalSetting() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getEmployeeId() != null ? getEmployeeId().hashCode() : 0);
        result = 31 * result + (getApprovalSetting() != null ? getApprovalSetting().hashCode() : 0);
        return result;
    }
}
