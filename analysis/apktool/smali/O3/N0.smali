.class public final LO3/N0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/Boolean;

.field public final c:J

.field public final d:Lcom/google/android/gms/internal/measurement/V;

.field public final e:Z

.field public final f:Ljava/lang/Long;

.field public final g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/V;Ljava/lang/Long;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, LO3/N0;->e:Z

    .line 6
    .line 7
    invoke-static {p1}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, LO3/N0;->a:Landroid/content/Context;

    .line 18
    .line 19
    iput-object p3, p0, LO3/N0;->f:Ljava/lang/Long;

    .line 20
    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    iput-object p2, p0, LO3/N0;->d:Lcom/google/android/gms/internal/measurement/V;

    .line 24
    .line 25
    iget-boolean p1, p2, Lcom/google/android/gms/internal/measurement/V;->s:Z

    .line 26
    .line 27
    iput-boolean p1, p0, LO3/N0;->e:Z

    .line 28
    .line 29
    iget-wide v1, p2, Lcom/google/android/gms/internal/measurement/V;->r:J

    .line 30
    .line 31
    iput-wide v1, p0, LO3/N0;->c:J

    .line 32
    .line 33
    iget-object p1, p2, Lcom/google/android/gms/internal/measurement/V;->u:Ljava/lang/String;

    .line 34
    .line 35
    iput-object p1, p0, LO3/N0;->g:Ljava/lang/String;

    .line 36
    .line 37
    iget-object p1, p2, Lcom/google/android/gms/internal/measurement/V;->t:Landroid/os/Bundle;

    .line 38
    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    const-string p2, "dataCollectionDefaultEnabled"

    .line 42
    .line 43
    invoke-virtual {p1, p2, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, LO3/N0;->b:Ljava/lang/Boolean;

    .line 52
    .line 53
    :cond_0
    return-void
.end method
