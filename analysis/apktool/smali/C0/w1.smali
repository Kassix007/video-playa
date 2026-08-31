.class public final LC0/w1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP/q;
.implements Landroidx/lifecycle/v;


# instance fields
.field public final q:LC0/A;

.field public final r:LP/u;

.field public s:Z

.field public t:Landroidx/lifecycle/q;

.field public u:LB5/e;


# direct methods
.method public constructor <init>(LC0/A;LP/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC0/w1;->q:LC0/A;

    .line 5
    .line 6
    iput-object p2, p0, LC0/w1;->r:LP/u;

    .line 7
    .line 8
    sget-object p1, LC0/r0;->a:LX/e;

    .line 9
    .line 10
    iput-object p1, p0, LC0/w1;->u:LB5/e;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 3

    .line 1
    iget-boolean v0, p0, LC0/w1;->s:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, LC0/w1;->s:Z

    .line 7
    .line 8
    iget-object v0, p0, LC0/w1;->q:LC0/A;

    .line 9
    .line 10
    invoke-virtual {v0}, LC0/A;->getView()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const v1, 0x7f09021d

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, LC0/w1;->t:Landroidx/lifecycle/q;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Landroidx/lifecycle/q;->c(Landroidx/lifecycle/w;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, LC0/w1;->r:LP/u;

    .line 29
    .line 30
    invoke-virtual {v0}, LP/u;->l()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final e(Landroidx/lifecycle/x;Landroidx/lifecycle/o;)V
    .locals 0

    .line 1
    sget-object p1, Landroidx/lifecycle/o;->ON_DESTROY:Landroidx/lifecycle/o;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LC0/w1;->d()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object p1, Landroidx/lifecycle/o;->ON_CREATE:Landroidx/lifecycle/o;

    .line 10
    .line 11
    if-ne p2, p1, :cond_1

    .line 12
    .line 13
    iget-boolean p1, p0, LC0/w1;->s:Z

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, LC0/w1;->u:LB5/e;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, LC0/w1;->g(LB5/e;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public final g(LB5/e;)V
    .locals 2

    .line 1
    new-instance v0, LA/Y;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1, p0, p1}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, LC0/w1;->q:LC0/A;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, LC0/A;->setOnViewTreeOwnersAvailable(LB5/c;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
