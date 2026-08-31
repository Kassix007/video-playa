.class public final La5/u;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:La5/y;

.field public final synthetic r:Lcom/web2native/MainActivity;

.field public final synthetic s:LP/W;


# direct methods
.method public constructor <init>(La5/y;Lcom/web2native/MainActivity;LP/W;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, La5/u;->q:La5/y;

    .line 2
    .line 3
    iput-object p2, p0, La5/u;->r:Lcom/web2native/MainActivity;

    .line 4
    .line 5
    iput-object p3, p0, La5/u;->s:LP/W;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance p1, La5/u;

    .line 2
    .line 3
    iget-object v0, p0, La5/u;->r:Lcom/web2native/MainActivity;

    .line 4
    .line 5
    iget-object v1, p0, La5/u;->s:LP/W;

    .line 6
    .line 7
    iget-object v2, p0, La5/u;->q:La5/y;

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, La5/u;-><init>(La5/y;Lcom/web2native/MainActivity;LP/W;Lq5/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La5/u;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, La5/u;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, La5/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La5/u;->q:La5/y;

    .line 5
    .line 6
    iget-object p1, p1, La5/y;->e:Landroidx/lifecycle/J;

    .line 7
    .line 8
    new-instance v0, LU4/m;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    iget-object v2, p0, La5/u;->s:LP/W;

    .line 12
    .line 13
    invoke-direct {v0, v2, v1}, LU4/m;-><init>(LP/W;I)V

    .line 14
    .line 15
    .line 16
    new-instance v1, LR4/N;

    .line 17
    .line 18
    const/4 v2, 0x7

    .line 19
    invoke-direct {v1, v0, v2}, LR4/N;-><init>(LB5/c;I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, La5/u;->r:Lcom/web2native/MainActivity;

    .line 23
    .line 24
    invoke-virtual {p1, v0, v1}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 25
    .line 26
    .line 27
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 28
    .line 29
    return-object p1
.end method
