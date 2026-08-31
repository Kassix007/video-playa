.class public final Lv/A;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:Lv/B;


# direct methods
.method public constructor <init>(Lv/B;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv/A;->r:Lv/B;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Ls5/i;-><init>(ILq5/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 1

    .line 1
    new-instance p1, Lv/A;

    .line 2
    .line 3
    iget-object v0, p0, Lv/A;->r:Lv/B;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lv/A;-><init>(Lv/B;Lq5/c;)V

    .line 6
    .line 7
    .line 8
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
    invoke-virtual {p0, p1, p2}, Lv/A;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lv/A;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lv/A;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lv/A;->q:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance v3, Lkotlin/jvm/internal/w;

    .line 26
    .line 27
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v4, Lkotlin/jvm/internal/w;

    .line 31
    .line 32
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance v5, Lkotlin/jvm/internal/w;

    .line 36
    .line 37
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iget-object v6, p0, Lv/A;->r:Lv/B;

    .line 41
    .line 42
    iget-object p1, v6, Lv/B;->E:Ly/i;

    .line 43
    .line 44
    iget-object p1, p1, Ly/i;->a:LP5/G;

    .line 45
    .line 46
    new-instance v2, LQ5/m;

    .line 47
    .line 48
    const/4 v7, 0x1

    .line 49
    invoke-direct/range {v2 .. v7}, LQ5/m;-><init>(Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 50
    .line 51
    .line 52
    iput v1, p0, Lv/A;->q:I

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-static {p1, v2, p0}, LP5/G;->h(LP5/G;LP5/i;Lq5/c;)V

    .line 58
    .line 59
    .line 60
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 61
    .line 62
    return-object p1
.end method
