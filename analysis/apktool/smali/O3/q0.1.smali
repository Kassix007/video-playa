.class public final LO3/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Lcom/google/android/gms/internal/measurement/L;

.field public final synthetic s:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/L;I)V
    .locals 0

    .line 1
    iput p3, p0, LO3/q0;->q:I

    iput-object p2, p0, LO3/q0;->r:Lcom/google/android/gms/internal/measurement/L;

    iput-object p1, p0, LO3/q0;->s:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, LO3/q0;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LO3/q0;->s:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 7
    .line 8
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c:LO3/t0;

    .line 9
    .line 10
    iget-object v1, v1, LO3/t0;->y:LO3/Y1;

    .line 11
    .line 12
    invoke-static {v1}, LO3/t0;->j(LO3/D0;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c:LO3/t0;

    .line 16
    .line 17
    iget-object v2, v0, LO3/t0;->O:Ljava/lang/Boolean;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    iget-object v0, v0, LO3/t0;->O:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    iget-object v2, p0, LO3/q0;->r:Lcom/google/android/gms/internal/measurement/L;

    .line 33
    .line 34
    invoke-virtual {v1, v2, v0}, LO3/Y1;->a0(Lcom/google/android/gms/internal/measurement/L;Z)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_0
    iget-object v0, p0, LO3/q0;->s:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 39
    .line 40
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c:LO3/t0;

    .line 41
    .line 42
    invoke-virtual {v0}, LO3/t0;->o()LO3/w1;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v1, p0, LO3/q0;->r:Lcom/google/android/gms/internal/measurement/L;

    .line 47
    .line 48
    invoke-virtual {v0}, LO3/C;->o()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, LO3/H;->p()V

    .line 52
    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    invoke-virtual {v0, v2}, LO3/w1;->E(Z)LO3/a2;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    new-instance v3, LO3/x0;

    .line 60
    .line 61
    const/4 v4, 0x6

    .line 62
    invoke-direct {v3, v0, v2, v1, v4}, LO3/x0;-><init>(Ljava/lang/Object;LO3/a2;Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v3}, LO3/w1;->C(Ljava/lang/Runnable;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
