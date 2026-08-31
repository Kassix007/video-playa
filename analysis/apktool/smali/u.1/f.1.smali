.class public final Lu/f;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:LO5/b;

.field public r:I

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:LO5/i;

.field public final synthetic u:Lu/c;

.field public final synthetic v:LP/W;

.field public final synthetic w:LP/W;


# direct methods
.method public constructor <init>(LO5/i;Lu/c;LP/W;LP/W;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu/f;->t:LO5/i;

    .line 2
    .line 3
    iput-object p2, p0, Lu/f;->u:Lu/c;

    .line 4
    .line 5
    iput-object p3, p0, Lu/f;->v:LP/W;

    .line 6
    .line 7
    iput-object p4, p0, Lu/f;->w:LP/W;

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
    new-instance v0, Lu/f;

    .line 2
    .line 3
    iget-object v3, p0, Lu/f;->v:LP/W;

    .line 4
    .line 5
    iget-object v4, p0, Lu/f;->w:LP/W;

    .line 6
    .line 7
    iget-object v1, p0, Lu/f;->t:LO5/i;

    .line 8
    .line 9
    iget-object v2, p0, Lu/f;->u:Lu/c;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lu/f;-><init>(LO5/i;Lu/c;LP/W;LP/W;Lq5/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lu/f;->s:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lu/f;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu/f;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lu/f;->r:I

    .line 2
    .line 3
    iget-object v1, p0, Lu/f;->t:LO5/i;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lu/f;->q:LO5/b;

    .line 11
    .line 12
    iget-object v3, p0, Lu/f;->s:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, LM5/w;

    .line 15
    .line 16
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lu/f;->s:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, LM5/w;

    .line 34
    .line 35
    invoke-interface {v1}, LO5/v;->iterator()LO5/b;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    move-object v3, p1

    .line 40
    :goto_0
    iput-object v3, p0, Lu/f;->s:Ljava/lang/Object;

    .line 41
    .line 42
    iput-object v0, p0, Lu/f;->q:LO5/b;

    .line 43
    .line 44
    iput v2, p0, Lu/f;->r:I

    .line 45
    .line 46
    invoke-virtual {v0, p0}, LO5/b;->b(Ls5/c;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    sget-object v4, Lr5/a;->q:Lr5/a;

    .line 51
    .line 52
    if-ne p1, v4, :cond_2

    .line 53
    .line 54
    return-object v4

    .line 55
    :cond_2
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_4

    .line 62
    .line 63
    invoke-virtual {v0}, LO5/b;->c()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-interface {v1}, LO5/v;->i()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-static {v4}, LO5/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    if-nez v4, :cond_3

    .line 76
    .line 77
    move-object v6, p1

    .line 78
    goto :goto_2

    .line 79
    :cond_3
    move-object v6, v4

    .line 80
    :goto_2
    new-instance v5, Lu/e;

    .line 81
    .line 82
    iget-object v9, p0, Lu/f;->w:LP/W;

    .line 83
    .line 84
    const/4 v10, 0x0

    .line 85
    iget-object v7, p0, Lu/f;->u:Lu/c;

    .line 86
    .line 87
    iget-object v8, p0, Lu/f;->v:LP/W;

    .line 88
    .line 89
    invoke-direct/range {v5 .. v10}, Lu/e;-><init>(Ljava/lang/Object;Lu/c;LP/W;LP/W;Lq5/c;)V

    .line 90
    .line 91
    .line 92
    const/4 p1, 0x3

    .line 93
    const/4 v4, 0x0

    .line 94
    invoke-static {v3, v4, v4, v5, p1}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_4
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 99
    .line 100
    return-object p1
.end method
