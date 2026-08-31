.class public final LD/h;
.super LE/C;
.source "SourceFile"


# instance fields
.field public final b:LD/u;

.field public final c:LE/Y;


# direct methods
.method public constructor <init>(LB5/c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LD/u;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LD/u;-><init>(LD/h;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LD/h;->b:LD/u;

    .line 10
    .line 11
    new-instance v0, LE/Y;

    .line 12
    .line 13
    invoke-direct {v0}, LE/Y;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LD/h;->c:LE/Y;

    .line 17
    .line 18
    invoke-interface {p1, p0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final k()LE/Y;
    .locals 1

    .line 1
    iget-object v0, p0, LD/h;->c:LE/Y;

    .line 2
    .line 3
    return-object v0
.end method
