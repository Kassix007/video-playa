.class public final Lu/K;
.super LO3/D0;
.source "SourceFile"


# instance fields
.field public final s:LP/f0;

.field public final t:LP/f0;


# direct methods
.method public constructor <init>(Lt/t;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LO3/D0;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lu/K;->s:LP/f0;

    .line 9
    .line 10
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lu/K;->t:LP/f0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final j()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lu/K;->s:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final k()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lu/K;->t:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final l(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu/K;->s:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final m(Lu/v0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final n()V
    .locals 0

    .line 1
    return-void
.end method
