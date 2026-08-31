.class public final LG/d;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:LG/e;

.field public final synthetic s:LB0/n0;

.field public final synthetic t:LB0/K;

.field public final synthetic u:LC/k;


# direct methods
.method public constructor <init>(LG/e;LB0/n0;LB0/K;LC/k;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG/d;->r:LG/e;

    .line 2
    .line 3
    iput-object p2, p0, LG/d;->s:LB0/n0;

    .line 4
    .line 5
    iput-object p3, p0, LG/d;->t:LB0/K;

    .line 6
    .line 7
    iput-object p4, p0, LG/d;->u:LC/k;

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
    new-instance v0, LG/d;

    .line 2
    .line 3
    iget-object v3, p0, LG/d;->t:LB0/K;

    .line 4
    .line 5
    iget-object v4, p0, LG/d;->u:LC/k;

    .line 6
    .line 7
    iget-object v1, p0, LG/d;->r:LG/e;

    .line 8
    .line 9
    iget-object v2, p0, LG/d;->s:LB0/n0;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, LG/d;-><init>(LG/e;LB0/n0;LB0/K;LC/k;Lq5/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, LG/d;->q:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, LG/d;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LG/d;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LG/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LG/d;->q:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, LM5/w;

    .line 7
    .line 8
    new-instance v0, LG/b;

    .line 9
    .line 10
    iget-object v1, p0, LG/d;->s:LB0/n0;

    .line 11
    .line 12
    iget-object v2, p0, LG/d;->t:LB0/K;

    .line 13
    .line 14
    iget-object v3, p0, LG/d;->r:LG/e;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-direct {v0, v3, v1, v2, v4}, LG/b;-><init>(LG/e;LB0/n0;LB0/K;Lq5/c;)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    invoke-static {p1, v4, v4, v0, v1}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 22
    .line 23
    .line 24
    new-instance v0, LG/c;

    .line 25
    .line 26
    iget-object v2, p0, LG/d;->u:LC/k;

    .line 27
    .line 28
    invoke-direct {v0, v3, v2, v4}, LG/c;-><init>(LG/e;LC/k;Lq5/c;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v4, v4, v0, v1}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method
