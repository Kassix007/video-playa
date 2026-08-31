.class public final Lt/y;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:Z

.field public final synthetic r:LB5/a;


# direct methods
.method public constructor <init>(ZLB5/a;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lt/y;->q:Z

    .line 2
    .line 3
    iput-object p2, p0, Lt/y;->r:LB5/a;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lj0/C;

    .line 2
    .line 3
    iget-boolean v0, p0, Lt/y;->q:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lt/y;->r:LB5/a;

    .line 8
    .line 9
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    iget-boolean v1, p1, Lj0/C;->A:Z

    .line 25
    .line 26
    if-eq v1, v0, :cond_1

    .line 27
    .line 28
    iget v1, p1, Lj0/C;->q:I

    .line 29
    .line 30
    or-int/lit16 v1, v1, 0x4000

    .line 31
    .line 32
    iput v1, p1, Lj0/C;->q:I

    .line 33
    .line 34
    iput-boolean v0, p1, Lj0/C;->A:Z

    .line 35
    .line 36
    :cond_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 37
    .line 38
    return-object p1
.end method
