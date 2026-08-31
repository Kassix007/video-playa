.class public final LM5/g0;
.super LM5/e0;
.source "SourceFile"


# instance fields
.field public final u:LM5/i0;

.field public final v:LM5/h0;

.field public final w:LM5/l;

.field public final x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LM5/i0;LM5/h0;LM5/l;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LR5/j;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM5/g0;->u:LM5/i0;

    .line 5
    .line 6
    iput-object p2, p0, LM5/g0;->v:LM5/h0;

    .line 7
    .line 8
    iput-object p3, p0, LM5/g0;->w:LM5/l;

    .line 9
    .line 10
    iput-object p4, p0, LM5/g0;->x:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final k()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final l(Ljava/lang/Throwable;)V
    .locals 6

    .line 1
    iget-object p1, p0, LM5/g0;->w:LM5/l;

    .line 2
    .line 3
    invoke-static {p1}, LM5/i0;->Q(LR5/j;)LM5/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LM5/g0;->u:LM5/i0;

    .line 8
    .line 9
    iget-object v2, p0, LM5/g0;->v:LM5/h0;

    .line 10
    .line 11
    iget-object v3, p0, LM5/g0;->x:Ljava/lang/Object;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, v2, v0, v3}, LM5/i0;->a0(LM5/h0;LM5/l;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, v2, LM5/h0;->q:LM5/k0;

    .line 23
    .line 24
    new-instance v4, LR5/i;

    .line 25
    .line 26
    const/4 v5, 0x2

    .line 27
    invoke-direct {v4, v5}, LR5/i;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v4, v5}, LR5/j;->e(LR5/j;I)Z

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, LM5/i0;->Q(LR5/j;)LM5/l;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    invoke-virtual {v1, v2, p1, v3}, LM5/i0;->a0(LM5/h0;LM5/l;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    :goto_0
    return-void

    .line 46
    :cond_1
    invoke-virtual {v1, v2, v3}, LM5/i0;->A(LM5/h0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {v1, p1}, LM5/i0;->m(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method
