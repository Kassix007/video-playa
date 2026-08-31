.class public final Lcom/google/android/gms/internal/measurement/l0;
.super Lcom/google/android/gms/internal/measurement/o0;
.source "SourceFile"


# instance fields
.field public final synthetic u:Z

.field public final synthetic v:Lcom/google/android/gms/internal/measurement/t0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/t0;Z)V
    .locals 0

    .line 1
    iput-boolean p2, p0, Lcom/google/android/gms/internal/measurement/l0;->u:Z

    .line 2
    .line 3
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/l0;->v:Lcom/google/android/gms/internal/measurement/t0;

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/o0;-><init>(Lcom/google/android/gms/internal/measurement/t0;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/l0;->v:Lcom/google/android/gms/internal/measurement/t0;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/t0;->f:Lcom/google/android/gms/internal/measurement/J;

    .line 4
    .line 5
    invoke-static {v0}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/l0;->u:Z

    .line 9
    .line 10
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/measurement/J;->setDataCollectionEnabled(Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
