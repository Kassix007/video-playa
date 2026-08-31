.class public final LM/I0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:LN/r;


# direct methods
.method public constructor <init>(ZLW0/c;LM/J0;LB5/c;Z)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, LM/I0;->a:Z

    .line 5
    .line 6
    iput-boolean p5, p0, LM/I0;->b:Z

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    sget-object p1, LM/J0;->s:LM/J0;

    .line 11
    .line 12
    if-eq p3, p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 16
    .line 17
    const-string p2, "The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true."

    .line 18
    .line 19
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1

    .line 23
    :cond_1
    :goto_0
    if-eqz p5, :cond_3

    .line 24
    .line 25
    sget-object p1, LM/J0;->q:LM/J0;

    .line 26
    .line 27
    if-eq p3, p1, :cond_2

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    const-string p2, "The initial value must not be set to Hidden if skipHiddenState is set to true."

    .line 33
    .line 34
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_3
    :goto_1
    sget-object v4, LM/G0;->b:Lu/z0;

    .line 39
    .line 40
    new-instance v0, LN/r;

    .line 41
    .line 42
    new-instance v2, LB0/a;

    .line 43
    .line 44
    const/16 p1, 0x11

    .line 45
    .line 46
    invoke-direct {v2, p1, p2}, LB0/a;-><init>(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    new-instance v3, LA0/d;

    .line 50
    .line 51
    const/16 p1, 0x8

    .line 52
    .line 53
    invoke-direct {v3, p1, p2}, LA0/d;-><init>(ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    move-object v1, p3

    .line 57
    move-object v5, p4

    .line 58
    invoke-direct/range {v0 .. v5}, LN/r;-><init>(LM/J0;LB0/a;LA0/d;Lu/k;LB5/c;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, LM/I0;->c:LN/r;

    .line 62
    .line 63
    return-void
.end method

.method public static a(LM/I0;LM/J0;Ls5/i;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LM/I0;->c:LN/r;

    .line 2
    .line 3
    iget-object v0, v0, LN/r;->k:LP/b0;

    .line 4
    .line 5
    invoke-virtual {v0}, LP/b0;->e()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object p0, p0, LM/I0;->c:LN/r;

    .line 10
    .line 11
    invoke-static {p0, p1, v0, p2}, Landroidx/compose/material3/internal/a;->b(LN/r;Ljava/lang/Object;FLs5/i;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 16
    .line 17
    if-ne p0, p1, :cond_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    sget-object p0, Lm5/y;->a:Lm5/y;

    .line 21
    .line 22
    return-object p0
.end method


# virtual methods
.method public final b(Ls5/i;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-boolean v0, p0, LM/I0;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    sget-object v0, LM/J0;->q:LM/J0;

    .line 6
    .line 7
    invoke-static {p0, v0, p1}, LM/I0;->a(LM/I0;LM/J0;Ls5/i;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function."

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1
.end method

.method public final c()Z
    .locals 2

    .line 1
    iget-object v0, p0, LM/I0;->c:LN/r;

    .line 2
    .line 3
    iget-object v0, v0, LN/r;->g:LP/f0;

    .line 4
    .line 5
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, LM/J0;->q:LM/J0;

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public final d(Ls5/i;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-boolean v0, p0, LM/I0;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    sget-object v0, LM/J0;->s:LM/J0;

    .line 6
    .line 7
    invoke-static {p0, v0, p1}, LM/I0;->a(LM/I0;LM/J0;Ls5/i;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function."

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1
.end method
