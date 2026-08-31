.class public final LO3/E1;
.super LO3/H;
.source "SourceFile"


# instance fields
.field public t:LI3/e;

.field public u:Z

.field public final v:Lk3/c;

.field public final w:LO3/D1;

.field public final x:LB0/o;


# direct methods
.method public constructor <init>(LO3/t0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LO3/H;-><init>(LO3/t0;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, LO3/E1;->u:Z

    .line 6
    .line 7
    new-instance p1, Lk3/c;

    .line 8
    .line 9
    invoke-direct {p1, p0}, Lk3/c;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, LO3/E1;->v:Lk3/c;

    .line 13
    .line 14
    new-instance p1, LO3/D1;

    .line 15
    .line 16
    invoke-direct {p1, p0}, LO3/D1;-><init>(LO3/E1;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LO3/E1;->w:LO3/D1;

    .line 20
    .line 21
    new-instance p1, LB0/o;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p0, p1, LB0/o;->r:Ljava/lang/Object;

    .line 27
    .line 28
    iput-object p1, p0, LO3/E1;->x:LB0/o;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final r()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final s()V
    .locals 3

    .line 1
    invoke-virtual {p0}, LO3/C;->o()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LO3/E1;->t:LI3/e;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, LI3/e;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x3

    .line 15
    invoke-direct {v0, v1, v2}, LI3/e;-><init>(Landroid/os/Looper;I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, LO3/E1;->t:LI3/e;

    .line 19
    .line 20
    :cond_0
    return-void
.end method
