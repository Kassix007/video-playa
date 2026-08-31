.class public final Lw/o0;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lw/H0;

.field public final synthetic t:J

.field public final synthetic u:Lkotlin/jvm/internal/v;


# direct methods
.method public constructor <init>(Lw/H0;JLkotlin/jvm/internal/v;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/o0;->s:Lw/H0;

    .line 2
    .line 3
    iput-wide p2, p0, Lw/o0;->t:J

    .line 4
    .line 5
    iput-object p4, p0, Lw/o0;->u:Lkotlin/jvm/internal/v;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 6

    .line 1
    new-instance v0, Lw/o0;

    .line 2
    .line 3
    iget-wide v2, p0, Lw/o0;->t:J

    .line 4
    .line 5
    iget-object v4, p0, Lw/o0;->u:Lkotlin/jvm/internal/v;

    .line 6
    .line 7
    iget-object v1, p0, Lw/o0;->s:Lw/H0;

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Lw/o0;-><init>(Lw/H0;JLkotlin/jvm/internal/v;Lq5/c;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, Lw/o0;->r:Ljava/lang/Object;

    .line 14
    .line 15
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
    invoke-virtual {p0, p1, p2}, Lw/o0;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw/o0;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw/o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lw/o0;->q:I

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
    iget-object p1, p0, Lw/o0;->r:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Lw/E0;

    .line 26
    .line 27
    iget-wide v2, p0, Lw/o0;->t:J

    .line 28
    .line 29
    iget-object v0, p0, Lw/o0;->s:Lw/H0;

    .line 30
    .line 31
    invoke-virtual {v0, v2, v3}, Lw/H0;->g(J)F

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    new-instance v7, LC0/Z;

    .line 36
    .line 37
    iget-object v2, p0, Lw/o0;->u:Lkotlin/jvm/internal/v;

    .line 38
    .line 39
    const/4 v3, 0x3

    .line 40
    invoke-direct {v7, v2, v0, p1, v3}, LC0/Z;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 41
    .line 42
    .line 43
    iput v1, p0, Lw/o0;->q:I

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    const/4 v6, 0x0

    .line 47
    const/16 v9, 0xc

    .line 48
    .line 49
    move-object v8, p0

    .line 50
    invoke-static/range {v4 .. v9}, Lu/d;->d(FFLu/k;LB5/e;Ls5/i;I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 55
    .line 56
    if-ne p1, v0, :cond_2

    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_2
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 60
    .line 61
    return-object p1
.end method
