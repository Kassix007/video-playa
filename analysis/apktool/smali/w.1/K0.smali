.class public final Lw/K0;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:Lv/w;

.field public final synthetic s:Lw/g0;

.field public final synthetic t:Lv0/l;


# direct methods
.method public constructor <init>(Lv/w;Lw/g0;Lv0/l;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/K0;->r:Lv/w;

    .line 2
    .line 3
    iput-object p2, p0, Lw/K0;->s:Lw/g0;

    .line 4
    .line 5
    iput-object p3, p0, Lw/K0;->t:Lv0/l;

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
    new-instance p1, Lw/K0;

    .line 2
    .line 3
    iget-object v0, p0, Lw/K0;->s:Lw/g0;

    .line 4
    .line 5
    iget-object v1, p0, Lw/K0;->t:Lv0/l;

    .line 6
    .line 7
    iget-object v2, p0, Lw/K0;->r:Lv/w;

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, Lw/K0;-><init>(Lv/w;Lw/g0;Lv0/l;Lq5/c;)V

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
    invoke-virtual {p0, p1, p2}, Lw/K0;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw/K0;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw/K0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lw/K0;->q:I

    .line 2
    .line 3
    sget-object v1, Lm5/y;->a:Lm5/y;

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
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

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
    iget-object p1, p0, Lw/K0;->t:Lv0/l;

    .line 26
    .line 27
    iget-wide v3, p1, Lv0/l;->c:J

    .line 28
    .line 29
    iput v2, p0, Lw/K0;->q:I

    .line 30
    .line 31
    new-instance p1, Lv/w;

    .line 32
    .line 33
    iget-object v0, p0, Lw/K0;->r:Lv/w;

    .line 34
    .line 35
    iget-object v0, v0, Lv/w;->t:Lv/x;

    .line 36
    .line 37
    invoke-direct {p1, v0, p0}, Lv/w;-><init>(Lv/x;Lq5/c;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lw/K0;->s:Lw/g0;

    .line 41
    .line 42
    iput-object v0, p1, Lv/w;->r:Lw/g0;

    .line 43
    .line 44
    iput-wide v3, p1, Lv/w;->s:J

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Lv/w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 51
    .line 52
    if-ne p1, v0, :cond_2

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_2
    :goto_0
    return-object v1
.end method
