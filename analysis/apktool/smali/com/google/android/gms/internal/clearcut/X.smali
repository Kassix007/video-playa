.class public final Lcom/google/android/gms/internal/clearcut/X;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lcom/google/android/gms/internal/clearcut/g;

.field public final b:Lcom/google/android/gms/internal/clearcut/Y;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/clearcut/x;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/clearcut/X;->a:Lcom/google/android/gms/internal/clearcut/g;

    .line 5
    .line 6
    new-instance v0, Lcom/google/android/gms/internal/clearcut/Y;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {v0, p1, p2, p3}, Lcom/google/android/gms/internal/clearcut/Y;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/google/android/gms/internal/clearcut/X;->b:Lcom/google/android/gms/internal/clearcut/Y;

    .line 16
    .line 17
    return-void
.end method
