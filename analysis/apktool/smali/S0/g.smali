.class public final LS0/g;
.super LE1/i;
.source "SourceFile"


# instance fields
.field public final synthetic q:LP/f0;

.field public final synthetic r:Lk3/c;


# direct methods
.method public constructor <init>(LP/f0;Lk3/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LS0/g;->q:LP/f0;

    .line 5
    .line 6
    iput-object p2, p0, LS0/g;->r:Lk3/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, LS0/g;->r:Lk3/c;

    .line 2
    .line 3
    sget-object v1, LS0/j;->a:LS0/k;

    .line 4
    .line 5
    iput-object v1, v0, Lk3/c;->q:Ljava/lang/Object;

    .line 6
    .line 7
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, LS0/g;->q:LP/f0;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, LS0/k;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, LS0/k;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, LS0/g;->r:Lk3/c;

    .line 15
    .line 16
    iput-object v0, v1, Lk3/c;->q:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method
