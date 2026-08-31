.class public final LP1/a;
.super LP1/c;
.source "SourceFile"


# static fields
.field public static final b:LP1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LP1/a;

    .line 2
    .line 3
    invoke-direct {v0}, LP1/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LP1/a;->b:LP1/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(LP1/b;)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method
