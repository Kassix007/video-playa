.class public final LE/I;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final synthetic b:LE/K;


# direct methods
.method public constructor <init>(LE/K;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE/I;->b:LE/K;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LE/I;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 6

    .line 1
    sget-wide v3, LE/L;->a:J

    .line 2
    .line 3
    iget-object v0, p0, LE/I;->b:LE/K;

    .line 4
    .line 5
    iget-object v1, v0, LE/K;->c:LB0/G0;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v5, v0, LE/K;->b:LE/c0;

    .line 11
    .line 12
    new-instance v0, LE/b0;

    .line 13
    .line 14
    move v2, p1

    .line 15
    invoke-direct/range {v0 .. v5}, LE/b0;-><init>(LB0/G0;IJLE/c0;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, LE/I;->a:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method
