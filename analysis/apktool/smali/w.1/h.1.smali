.class public final Lw/h;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lw/j1;

.field public final synthetic t:Lw/j;

.field public final synthetic u:Lw/c;

.field public final synthetic v:LM5/b0;


# direct methods
.method public constructor <init>(Lw/j1;Lw/j;Lw/c;LM5/b0;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/h;->s:Lw/j1;

    .line 2
    .line 3
    iput-object p2, p0, Lw/h;->t:Lw/j;

    .line 4
    .line 5
    iput-object p3, p0, Lw/h;->u:Lw/c;

    .line 6
    .line 7
    iput-object p4, p0, Lw/h;->v:LM5/b0;

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
    new-instance v0, Lw/h;

    .line 2
    .line 3
    iget-object v3, p0, Lw/h;->u:Lw/c;

    .line 4
    .line 5
    iget-object v4, p0, Lw/h;->v:LM5/b0;

    .line 6
    .line 7
    iget-object v1, p0, Lw/h;->s:Lw/j1;

    .line 8
    .line 9
    iget-object v2, p0, Lw/h;->t:Lw/j;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lw/h;-><init>(Lw/j1;Lw/j;Lw/c;LM5/b0;Lq5/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lw/h;->r:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lw/E0;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lw/h;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw/h;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lw/h;->q:I

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
    iget-object p1, p0, Lw/h;->r:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Lw/E0;

    .line 26
    .line 27
    iget-object v0, p0, Lw/h;->t:Lw/j;

    .line 28
    .line 29
    iget-object v2, p0, Lw/h;->u:Lw/c;

    .line 30
    .line 31
    invoke-static {v0, v2}, Lw/j;->x0(Lw/j;Lw/c;)F

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    iget-object v4, p0, Lw/h;->s:Lw/j1;

    .line 36
    .line 37
    iput v3, v4, Lw/j1;->e:F

    .line 38
    .line 39
    new-instance v3, LA/J;

    .line 40
    .line 41
    iget-object v5, p0, Lw/h;->v:LM5/b0;

    .line 42
    .line 43
    const/16 v6, 0xe

    .line 44
    .line 45
    invoke-direct {v3, v0, v5, p1, v6}, LA/J;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    new-instance p1, LC/k;

    .line 49
    .line 50
    const/16 v5, 0x9

    .line 51
    .line 52
    invoke-direct {p1, v0, v4, v2, v5}, LC/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    iput v1, p0, Lw/h;->q:I

    .line 56
    .line 57
    invoke-virtual {v4, v3, p1, p0}, Lw/j1;->a(LA/J;LC/k;Ls5/c;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 62
    .line 63
    if-ne p1, v0, :cond_2

    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_2
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 67
    .line 68
    return-object p1
.end method
