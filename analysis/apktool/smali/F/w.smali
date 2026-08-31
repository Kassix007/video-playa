.class public final LF/w;
.super LE/C;
.source "SourceFile"


# instance fields
.field public final b:LE/Y;


# direct methods
.method public constructor <init>(LB5/g;LB5/c;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LE/Y;

    .line 5
    .line 6
    invoke-direct {v0}, LE/Y;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, LF/q;

    .line 10
    .line 11
    invoke-direct {v1, p2, p1}, LF/q;-><init>(LB5/c;LB5/g;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p3, v1}, LE/Y;->a(ILE/q;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, LF/w;->b:LE/Y;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final k()LE/Y;
    .locals 1

    .line 1
    iget-object v0, p0, LF/w;->b:LE/Y;

    .line 2
    .line 3
    return-object v0
.end method
