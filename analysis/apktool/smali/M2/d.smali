.class public final LM2/d;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:LM2/h;

.field public final synthetic s:Lkotlin/jvm/internal/y;

.field public final synthetic t:Lkotlin/jvm/internal/y;

.field public final synthetic u:LU2/g;

.field public final synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lkotlin/jvm/internal/y;

.field public final synthetic x:LI2/i;


# direct methods
.method public constructor <init>(LM2/h;Lkotlin/jvm/internal/y;Lkotlin/jvm/internal/y;LU2/g;Ljava/lang/Object;Lkotlin/jvm/internal/y;LI2/i;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LM2/d;->r:LM2/h;

    .line 2
    .line 3
    iput-object p2, p0, LM2/d;->s:Lkotlin/jvm/internal/y;

    .line 4
    .line 5
    iput-object p3, p0, LM2/d;->t:Lkotlin/jvm/internal/y;

    .line 6
    .line 7
    iput-object p4, p0, LM2/d;->u:LU2/g;

    .line 8
    .line 9
    iput-object p5, p0, LM2/d;->v:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p6, p0, LM2/d;->w:Lkotlin/jvm/internal/y;

    .line 12
    .line 13
    iput-object p7, p0, LM2/d;->x:LI2/i;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Ls5/i;-><init>(ILq5/c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 9

    .line 1
    new-instance v0, LM2/d;

    .line 2
    .line 3
    iget-object v6, p0, LM2/d;->w:Lkotlin/jvm/internal/y;

    .line 4
    .line 5
    iget-object v7, p0, LM2/d;->x:LI2/i;

    .line 6
    .line 7
    iget-object v1, p0, LM2/d;->r:LM2/h;

    .line 8
    .line 9
    iget-object v2, p0, LM2/d;->s:Lkotlin/jvm/internal/y;

    .line 10
    .line 11
    iget-object v3, p0, LM2/d;->t:Lkotlin/jvm/internal/y;

    .line 12
    .line 13
    iget-object v4, p0, LM2/d;->u:LU2/g;

    .line 14
    .line 15
    iget-object v5, p0, LM2/d;->v:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, LM2/d;-><init>(LM2/h;Lkotlin/jvm/internal/y;Lkotlin/jvm/internal/y;LU2/g;Ljava/lang/Object;Lkotlin/jvm/internal/y;LI2/i;Lq5/c;)V

    .line 19
    .line 20
    .line 21
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
    invoke-virtual {p0, p1, p2}, LM2/d;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LM2/d;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LM2/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, LM2/d;->q:I

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
    return-object p1

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
    iget-object p1, p0, LM2/d;->s:Lkotlin/jvm/internal/y;

    .line 24
    .line 25
    iget-object p1, p1, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v3, p1

    .line 28
    check-cast v3, LL2/i;

    .line 29
    .line 30
    iget-object p1, p0, LM2/d;->t:Lkotlin/jvm/internal/y;

    .line 31
    .line 32
    iget-object p1, p1, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 33
    .line 34
    move-object v4, p1

    .line 35
    check-cast v4, LI2/g;

    .line 36
    .line 37
    iget-object p1, p0, LM2/d;->w:Lkotlin/jvm/internal/y;

    .line 38
    .line 39
    iget-object p1, p1, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v7, p1

    .line 42
    check-cast v7, LU2/n;

    .line 43
    .line 44
    iput v1, p0, LM2/d;->q:I

    .line 45
    .line 46
    iget-object v2, p0, LM2/d;->r:LM2/h;

    .line 47
    .line 48
    iget-object v5, p0, LM2/d;->u:LU2/g;

    .line 49
    .line 50
    iget-object v6, p0, LM2/d;->v:Ljava/lang/Object;

    .line 51
    .line 52
    iget-object v8, p0, LM2/d;->x:LI2/i;

    .line 53
    .line 54
    move-object v9, p0

    .line 55
    invoke-static/range {v2 .. v9}, LM2/h;->a(LM2/h;LL2/i;LI2/g;LU2/g;Ljava/lang/Object;LU2/n;LI2/i;Ls5/c;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 60
    .line 61
    if-ne p1, v0, :cond_2

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_2
    return-object p1
.end method
