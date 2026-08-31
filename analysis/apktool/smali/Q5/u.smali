.class public final LQ5/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq5/h;


# instance fields
.field public final synthetic q:Lq5/h;

.field public final r:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;Lq5/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LQ5/u;->q:Lq5/h;

    .line 5
    .line 6
    iput-object p1, p0, LQ5/u;->r:Ljava/lang/Throwable;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final fold(Ljava/lang/Object;LB5/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LQ5/u;->q:Lq5/h;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lq5/h;->fold(Ljava/lang/Object;LB5/e;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final get(Lq5/g;)Lq5/f;
    .locals 1

    .line 1
    iget-object v0, p0, LQ5/u;->q:Lq5/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final minusKey(Lq5/g;)Lq5/h;
    .locals 1

    .line 1
    iget-object v0, p0, LQ5/u;->q:Lq5/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lq5/h;->minusKey(Lq5/g;)Lq5/h;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final plus(Lq5/h;)Lq5/h;
    .locals 1

    .line 1
    iget-object v0, p0, LQ5/u;->q:Lq5/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lq5/h;->plus(Lq5/h;)Lq5/h;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
