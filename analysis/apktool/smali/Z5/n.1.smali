.class public abstract LZ5/n;
.super LZ5/a;
.source "SourceFile"


# instance fields
.field public final a:LV5/a;


# direct methods
.method public constructor <init>(LV5/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZ5/n;->a:LV5/a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public g(LY5/a;ILjava/lang/Object;)V
    .locals 3

    .line 1
    invoke-interface {p0}, LV5/a;->b()LX5/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LZ5/n;->a:LV5/a;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-interface {p1, v0, p2, v1, v2}, LY5/a;->b(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p0, p2, p3, p1}, LZ5/n;->j(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public abstract j(ILjava/lang/Object;Ljava/lang/Object;)V
.end method
