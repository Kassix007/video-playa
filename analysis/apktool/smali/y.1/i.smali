.class public final Ly/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LP5/G;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-static {v0}, LP5/H;->a(I)LP5/G;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Ly/i;->a:LP5/G;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Ly/h;Ls5/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ly/i;->a:LP5/G;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LP5/G;->emit(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 7
    .line 8
    return-object p1
.end method

.method public final b(Ly/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly/i;->a:LP5/G;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP5/G;->n(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
