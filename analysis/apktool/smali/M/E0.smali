.class public final LM/E0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu0/a;


# instance fields
.field public final synthetic q:LM/I0;

.field public final synthetic r:LB5/c;


# direct methods
.method public constructor <init>(LM/I0;LB5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM/E0;->q:LM/I0;

    .line 5
    .line 6
    iput-object p2, p0, LM/E0;->r:LB5/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final F(IJJ)J
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    if-ne p1, p2, :cond_1

    .line 3
    .line 4
    iget-object p1, p0, LM/E0;->q:LM/I0;

    .line 5
    .line 6
    iget-object p1, p1, LM/I0;->c:LN/r;

    .line 7
    .line 8
    const-wide p2, 0xffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    and-long/2addr p2, p4

    .line 14
    long-to-int p2, p2

    .line 15
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-virtual {p1, p2}, LN/r;->e(F)F

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    iget-object p1, p1, LN/r;->j:LP/b0;

    .line 24
    .line 25
    invoke-virtual {p1}, LP/b0;->e()F

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    const/4 p4, 0x0

    .line 34
    if-eqz p3, :cond_0

    .line 35
    .line 36
    move p3, p4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {p1}, LP/b0;->e()F

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    :goto_0
    invoke-virtual {p1, p2}, LP/b0;->f(F)V

    .line 43
    .line 44
    .line 45
    sub-float/2addr p2, p3

    .line 46
    invoke-static {p4, p2}, Lcom/google/android/gms/internal/measurement/P1;->b(FF)J

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    return-wide p1

    .line 51
    :cond_1
    const-wide/16 p1, 0x0

    .line 52
    .line 53
    return-wide p1
.end method

.method public final I(JLq5/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {p1, p2}, LW0/p;->c(J)F

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    iget-object v0, p0, LM/E0;->q:LM/I0;

    .line 6
    .line 7
    iget-object v1, v0, LM/I0;->c:LN/r;

    .line 8
    .line 9
    invoke-virtual {v1}, LN/r;->f()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v0, v0, LM/I0;->c:LN/r;

    .line 14
    .line 15
    invoke-virtual {v0}, LN/r;->d()LN/y;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, LN/y;->c()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v2, 0x0

    .line 24
    cmpg-float v2, p3, v2

    .line 25
    .line 26
    if-gez v2, :cond_0

    .line 27
    .line 28
    cmpl-float v0, v1, v0

    .line 29
    .line 30
    if-lez v0, :cond_0

    .line 31
    .line 32
    new-instance v0, Ljava/lang/Float;

    .line 33
    .line 34
    invoke-direct {v0, p3}, Ljava/lang/Float;-><init>(F)V

    .line 35
    .line 36
    .line 37
    iget-object p3, p0, LM/E0;->r:LB5/c;

    .line 38
    .line 39
    invoke-interface {p3, v0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const-wide/16 p1, 0x0

    .line 44
    .line 45
    :goto_0
    new-instance p3, LW0/p;

    .line 46
    .line 47
    invoke-direct {p3, p1, p2}, LW0/p;-><init>(J)V

    .line 48
    .line 49
    .line 50
    return-object p3
.end method

.method public final b0(IJ)J
    .locals 2

    .line 1
    const-wide v0, 0xffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    and-long/2addr p2, v0

    .line 7
    long-to-int p2, p2

    .line 8
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    const/4 p3, 0x0

    .line 13
    cmpg-float v0, p2, p3

    .line 14
    .line 15
    if-gez v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    if-ne p1, v0, :cond_1

    .line 19
    .line 20
    iget-object p1, p0, LM/E0;->q:LM/I0;

    .line 21
    .line 22
    iget-object p1, p1, LM/I0;->c:LN/r;

    .line 23
    .line 24
    invoke-virtual {p1, p2}, LN/r;->e(F)F

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    iget-object p1, p1, LN/r;->j:LP/b0;

    .line 29
    .line 30
    invoke-virtual {p1}, LP/b0;->e()F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    move v0, p3

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {p1}, LP/b0;->e()F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    :goto_0
    invoke-virtual {p1, p2}, LP/b0;->f(F)V

    .line 47
    .line 48
    .line 49
    sub-float/2addr p2, v0

    .line 50
    invoke-static {p3, p2}, Lcom/google/android/gms/internal/measurement/P1;->b(FF)J

    .line 51
    .line 52
    .line 53
    move-result-wide p1

    .line 54
    return-wide p1

    .line 55
    :cond_1
    const-wide/16 p1, 0x0

    .line 56
    .line 57
    return-wide p1
.end method

.method public final n(JJLq5/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p3, p4}, LW0/p;->c(J)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    new-instance p2, Ljava/lang/Float;

    .line 6
    .line 7
    invoke-direct {p2, p1}, Ljava/lang/Float;-><init>(F)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, LM/E0;->r:LB5/c;

    .line 11
    .line 12
    invoke-interface {p1, p2}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    new-instance p1, LW0/p;

    .line 16
    .line 17
    invoke-direct {p1, p3, p4}, LW0/p;-><init>(J)V

    .line 18
    .line 19
    .line 20
    return-object p1
.end method
