.class public final Lcom/google/android/gms/internal/measurement/d0;
.super Lcom/google/android/gms/internal/measurement/o0;
.source "SourceFile"


# instance fields
.field public final synthetic u:Lcom/google/android/gms/internal/measurement/t0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/t0;)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/d0;->u:Lcom/google/android/gms/internal/measurement/t0;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/o0;-><init>(Lcom/google/android/gms/internal/measurement/t0;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d0;->u:Lcom/google/android/gms/internal/measurement/t0;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/t0;->f:Lcom/google/android/gms/internal/measurement/J;

    .line 4
    .line 5
    invoke-static {v0}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, Lcom/google/android/gms/internal/measurement/o0;->q:J

    .line 9
    .line 10
    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/J;->resetAnalyticsData(J)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
