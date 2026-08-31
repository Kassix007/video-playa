.class public abstract La2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/adservices/measurement/MeasurementManager;


# direct methods
.method public constructor <init>(Landroid/adservices/measurement/MeasurementManager;)V
    .locals 1

    .line 1
    const-string v0, "mMeasurementManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La2/e;->a:Landroid/adservices/measurement/MeasurementManager;

    .line 10
    .line 11
    return-void
.end method

.method public static b(La2/e;La2/a;Lq5/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La2/e;",
            "La2/a;",
            "Lq5/c<",
            "-",
            "Lm5/y;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, LM5/h;

    .line 2
    .line 3
    invoke-static {p2}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-direct {p1, v0, p2}, LM5/h;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, LM5/h;->s()V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La2/e;->a:Landroid/adservices/measurement/MeasurementManager;

    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
.end method

.method public static d(La2/e;Lq5/c;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La2/e;",
            "Lq5/c<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, LM5/h;

    .line 2
    .line 3
    invoke-static {p1}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p1}, LM5/h;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LM5/h;->s()V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La2/e;->a:Landroid/adservices/measurement/MeasurementManager;

    .line 15
    .line 16
    new-instance p1, La2/c;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {p1, v1}, La2/c;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lr1/c;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lr1/c;-><init>(LM5/h;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, p1, v1}, LO3/s0;->j(Landroid/adservices/measurement/MeasurementManager;La2/c;Landroid/os/OutcomeReceiver;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, LM5/h;->r()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public static g(La2/e;La2/f;Lq5/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La2/e;",
            "La2/f;",
            "Lq5/c<",
            "-",
            "Lm5/y;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, La2/d;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p1, p0, v0}, La2/d;-><init>(La2/e;Lq5/c;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1, p2}, LM5/y;->g(LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 12
    .line 13
    if-ne p0, p1, :cond_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    sget-object p0, Lm5/y;->a:Lm5/y;

    .line 17
    .line 18
    return-object p0
.end method

.method public static h(La2/e;Landroid/net/Uri;Landroid/view/InputEvent;Lq5/c;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La2/e;",
            "Landroid/net/Uri;",
            "Landroid/view/InputEvent;",
            "Lq5/c<",
            "-",
            "Lm5/y;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, LM5/h;

    .line 2
    .line 3
    invoke-static {p3}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p3}, LM5/h;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LM5/h;->s()V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La2/e;->a:Landroid/adservices/measurement/MeasurementManager;

    .line 15
    .line 16
    new-instance p3, La2/c;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {p3, v1}, La2/c;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lr1/c;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lr1/c;-><init>(LM5/h;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, p1, p2, p3, v1}, LO3/s0;->l(Landroid/adservices/measurement/MeasurementManager;Landroid/net/Uri;Landroid/view/InputEvent;La2/c;Landroid/os/OutcomeReceiver;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, LM5/h;->r()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 35
    .line 36
    if-ne p0, p1, :cond_0

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_0
    sget-object p0, Lm5/y;->a:Lm5/y;

    .line 40
    .line 41
    return-object p0
.end method

.method public static j(La2/e;Landroid/net/Uri;Lq5/c;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La2/e;",
            "Landroid/net/Uri;",
            "Lq5/c<",
            "-",
            "Lm5/y;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, LM5/h;

    .line 2
    .line 3
    invoke-static {p2}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p2}, LM5/h;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LM5/h;->s()V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La2/e;->a:Landroid/adservices/measurement/MeasurementManager;

    .line 15
    .line 16
    new-instance p2, La2/c;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {p2, v1}, La2/c;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lr1/c;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lr1/c;-><init>(LM5/h;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, p1, p2, v1}, LO3/s0;->k(Landroid/adservices/measurement/MeasurementManager;Landroid/net/Uri;La2/c;Landroid/os/OutcomeReceiver;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, LM5/h;->r()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 35
    .line 36
    if-ne p0, p1, :cond_0

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_0
    sget-object p0, Lm5/y;->a:Lm5/y;

    .line 40
    .line 41
    return-object p0
.end method

.method public static l(La2/e;La2/g;Lq5/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La2/e;",
            "La2/g;",
            "Lq5/c<",
            "-",
            "Lm5/y;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, LM5/h;

    .line 2
    .line 3
    invoke-static {p2}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-direct {p1, v0, p2}, LM5/h;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, LM5/h;->s()V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La2/e;->a:Landroid/adservices/measurement/MeasurementManager;

    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
.end method

.method public static n(La2/e;La2/h;Lq5/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La2/e;",
            "La2/h;",
            "Lq5/c<",
            "-",
            "Lm5/y;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, LM5/h;

    .line 2
    .line 3
    invoke-static {p2}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-direct {p1, v0, p2}, LM5/h;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, LM5/h;->s()V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La2/e;->a:Landroid/adservices/measurement/MeasurementManager;

    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
.end method


# virtual methods
.method public a(La2/a;Lq5/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La2/a;",
            "Lq5/c<",
            "-",
            "Lm5/y;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, La2/e;->b(La2/e;La2/a;Lq5/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public c(Lq5/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq5/c<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, La2/e;->d(La2/e;Lq5/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public e(La2/f;Lq5/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La2/f;",
            "Lq5/c<",
            "-",
            "Lm5/y;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, La2/e;->g(La2/e;La2/f;Lq5/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public f(Landroid/net/Uri;Landroid/view/InputEvent;Lq5/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroid/view/InputEvent;",
            "Lq5/c<",
            "-",
            "Lm5/y;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2, p3}, La2/e;->h(La2/e;Landroid/net/Uri;Landroid/view/InputEvent;Lq5/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public i(Landroid/net/Uri;Lq5/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lq5/c<",
            "-",
            "Lm5/y;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, La2/e;->j(La2/e;Landroid/net/Uri;Lq5/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public k(La2/g;Lq5/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La2/g;",
            "Lq5/c<",
            "-",
            "Lm5/y;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, La2/e;->l(La2/e;La2/g;Lq5/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public m(La2/h;Lq5/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La2/h;",
            "Lq5/c<",
            "-",
            "Lm5/y;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, La2/e;->n(La2/e;La2/h;Lq5/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
