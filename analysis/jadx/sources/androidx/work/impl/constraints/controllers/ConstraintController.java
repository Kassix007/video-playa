package androidx.work.impl.constraints.controllers;

import P5.InterfaceC0397h;
import androidx.work.Constraints;
import androidx.work.impl.model.WorkSpec;

/* JADX INFO: loaded from: classes.dex */
public interface ConstraintController {
    boolean hasConstraint(WorkSpec workSpec);

    boolean isCurrentlyConstrained(WorkSpec workSpec);

    InterfaceC0397h track(Constraints constraints);
}
