.class public final Lw/P0;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lv0/o;

.field public final synthetic t:Lv/w;

.field public final synthetic u:Lm0/a;

.field public final synthetic v:Lw/g0;


# direct methods
.method public constructor <init>(Lv0/o;Lv/w;Lm0/a;Lw/g0;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/P0;->s:Lv0/o;

    .line 2
    .line 3
    iput-object p2, p0, Lw/P0;->t:Lv/w;

    .line 4
    .line 5
    iput-object p3, p0, Lw/P0;->u:Lm0/a;

    .line 6
    .line 7
    iput-object p4, p0, Lw/P0;->v:Lw/g0;

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
    new-instance v0, Lw/P0;

    .line 2
    .line 3
    iget-object v3, p0, Lw/P0;->u:Lm0/a;

    .line 4
    .line 5
    iget-object v4, p0, Lw/P0;->v:Lw/g0;

    .line 6
    .line 7
    iget-object v1, p0, Lw/P0;->s:Lv0/o;

    .line 8
    .line 9
    iget-object v2, p0, Lw/P0;->t:Lv/w;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lw/P0;-><init>(Lv0/o;Lv/w;Lm0/a;Lw/g0;Lq5/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lw/P0;->r:Ljava/lang/Object;

    .line 16
    .line 17
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
    invoke-virtual {p0, p1, p2}, Lw/P0;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw/P0;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw/P0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lw/P0;->q:I

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
    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lw/P0;->r:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v3, p1

    .line 26
    check-cast v3, LM5/w;

    .line 27
    .line 28
    new-instance v2, Lw/O0;

    .line 29
    .line 30
    iget-object v6, p0, Lw/P0;->v:Lw/g0;

    .line 31
    .line 32
    const/4 v7, 0x0

    .line 33
    iget-object v4, p0, Lw/P0;->t:Lv/w;

    .line 34
    .line 35
    iget-object v5, p0, Lw/P0;->u:Lm0/a;

    .line 36
    .line 37
    invoke-direct/range {v2 .. v7}, Lw/O0;-><init>(LM5/w;Lv/w;Lm0/a;Lw/g0;Lq5/c;)V

    .line 38
    .line 39
    .line 40
    iput v1, p0, Lw/P0;->q:I

    .line 41
    .line 42
    iget-object p1, p0, Lw/P0;->s:Lv0/o;

    .line 43
    .line 44
    invoke-static {p1, v2, p0}, Lw/p0;->c(Lv0/o;LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 49
    .line 50
    if-ne p1, v0, :cond_2

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_2
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 54
    .line 55
    return-object p1
.end method
