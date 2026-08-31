.class public final La5/t;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:La5/y;

.field public final synthetic r:Lcom/web2native/MainActivity;

.field public final synthetic s:Lkotlin/jvm/internal/y;

.field public final synthetic t:Lkotlin/jvm/internal/y;


# direct methods
.method public constructor <init>(La5/y;Lcom/web2native/MainActivity;Lkotlin/jvm/internal/y;Lkotlin/jvm/internal/y;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, La5/t;->q:La5/y;

    .line 2
    .line 3
    iput-object p2, p0, La5/t;->r:Lcom/web2native/MainActivity;

    .line 4
    .line 5
    iput-object p3, p0, La5/t;->s:Lkotlin/jvm/internal/y;

    .line 6
    .line 7
    iput-object p4, p0, La5/t;->t:Lkotlin/jvm/internal/y;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Ls5/i;-><init>(ILq5/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 6

    .line 1
    new-instance v0, La5/t;

    .line 2
    .line 3
    iget-object v3, p0, La5/t;->s:Lkotlin/jvm/internal/y;

    .line 4
    .line 5
    iget-object v4, p0, La5/t;->t:Lkotlin/jvm/internal/y;

    .line 6
    .line 7
    iget-object v1, p0, La5/t;->q:La5/y;

    .line 8
    .line 9
    iget-object v2, p0, La5/t;->r:Lcom/web2native/MainActivity;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, La5/t;-><init>(La5/y;Lcom/web2native/MainActivity;Lkotlin/jvm/internal/y;Lkotlin/jvm/internal/y;Lq5/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
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
    invoke-virtual {p0, p1, p2}, La5/t;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, La5/t;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, La5/t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    new-instance v1, Lkotlin/jvm/internal/y;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v3, p0, La5/t;->q:La5/y;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    iget-object p1, v3, La5/y;->e:Landroidx/lifecycle/J;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    new-instance v0, LW1/e;

    .line 18
    .line 19
    const/4 v5, 0x3

    .line 20
    iget-object v2, p0, La5/t;->s:Lkotlin/jvm/internal/y;

    .line 21
    .line 22
    iget-object v4, p0, La5/t;->t:Lkotlin/jvm/internal/y;

    .line 23
    .line 24
    invoke-direct/range {v0 .. v5}, LW1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    new-instance v1, LR4/N;

    .line 28
    .line 29
    const/4 v2, 0x7

    .line 30
    invoke-direct {v1, v0, v2}, LR4/N;-><init>(LB5/c;I)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, La5/t;->r:Lcom/web2native/MainActivity;

    .line 34
    .line 35
    invoke-virtual {p1, v0, v1}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 39
    .line 40
    return-object p1
.end method
